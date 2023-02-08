package StructuralDesign.FileDownloade;

import java.net.MalformedURLException;
import java.net.URL;

public class FileDownloaderProxy implements Downloader {
    private FileDownloader fileDownloader;

    public FileDownloaderProxy() throws MalformedURLException {
        fileDownloader = new FileDownloader(new URL("a", "a", 1, "a"), "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
    }

    @Override
    public URL download(URL url, String urlConnection) {
        return null;
    }
}
