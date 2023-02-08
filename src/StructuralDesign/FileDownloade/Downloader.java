package StructuralDesign.FileDownloade;

import java.net.URL;

public interface Downloader {
    URL download(URL url, String urlConnection);

}
