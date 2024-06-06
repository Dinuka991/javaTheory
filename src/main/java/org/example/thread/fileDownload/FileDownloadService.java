package org.example.thread.fileDownload;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class FileDownloadService {

    private final ExecutorService executor = Executors.newFixedThreadPool(10);

    public CompletableFuture<String> writeTabAsync(String tabData) {
        return CompletableFuture.supplyAsync(() -> {
            // Simulate writing tab data (this could be writing to a file or processing data)
            try {
                Thread.sleep(1000); // Simulate delay
                System.out.println("Processed: " + tabData);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Processed: " + tabData;
        }, executor);
    }

    public CompletableFuture<List<String>> processTabs(List<String> tabs) {
        List<CompletableFuture<String>> futures = new ArrayList<>();

        for (String tab : tabs) {
            futures.add(writeTabAsync(tab));
        }

        CompletableFuture<Void> allOf = CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));

        return allOf.thenApply(v -> {
            List<String> results = new ArrayList<>();
            for (CompletableFuture<String> future : futures) {
                try {
                    results.add(future.get());
                } catch (InterruptedException | ExecutionException e) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException(e);
                }
            }
            return results;
        });
    }

    public void downloadFile() {
        List<String> tabs = List.of("Tab1", "Tab2", "Tab3", "Tab4");

        CompletableFuture<List<String>> resultFuture = processTabs(tabs);

        resultFuture.thenAccept(results -> {
            System.out.println("All tabs processed. Ready for download.");
            // Combine the results as needed and prepare for download
            results.forEach(System.out::println);
        }).join(); // Block and wait for completion in main thread for demo purposes
    }

    public static void main(String[] args) {
        FileDownloadService service = new FileDownloadService();
        service.downloadFile(); // Simulate file download
    }
}
