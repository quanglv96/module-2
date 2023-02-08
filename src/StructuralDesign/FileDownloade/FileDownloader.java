package StructuralDesign.FileDownloade;

import java.net.URL;

public class FileDownloader implements Downloader{
    private URL url;
    public String urlConnection;

    public FileDownloader(URL url, String urlConnection) {
        this.url = url;
        this.urlConnection = urlConnection;
    }

    @Override
    public URL download(URL url, String urlConnection) {
        return url;
    }
}
