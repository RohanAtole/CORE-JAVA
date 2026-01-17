class DownloadTask implements Runnable {
    private String fileName;

    DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(fileName + " downloading... " + (i * 20) + "%");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Download interrupted");
            }
        }
        System.out.println(fileName + " download completed!");
    }
}

public class FileDownloader {

    public static void main(String[] args) {

        Thread t1 = new Thread(new DownloadTask("video.mp4"));
        Thread t2 = new Thread(new DownloadTask("music.mp3"));

        t1.start();
        t2.start();
    }
}
