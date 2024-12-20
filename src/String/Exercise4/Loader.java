package String.Exercise4;

public class Loader {
    private static final int PROGRESS_BAR_LENGTH = 10;
    private static final String PRINT_FORMAT = "Wczytywanie %c %5.2f%% (%-" + PROGRESS_BAR_LENGTH + "s)\r";
    private static final int PROGRESS_MAX_VALUE = 100;
    private static final double PROGRESS_STEP = 0.5;
    private static final String PROGRESS_BAR_SYMBOL = "#";

    public static void main(String[] args) {

        double progress = 0.0;

        for (int i = 0; i <= PROGRESS_MAX_VALUE; i++) {
            String progressBar = getProgressBar(progress);
            char progressIndicator = i % 2 == 0 ? '/' : '\\';
            System.out.printf(PRINT_FORMAT, progressIndicator, progress , progressBar);
            progress = i * PROGRESS_STEP;
            pause();
        }

    }

    private static String getProgressBar(double progress) {
        double progressBarStep = PROGRESS_MAX_VALUE / PROGRESS_BAR_LENGTH;
        int numberOfDots = (int)(progress / progressBarStep);
        return PROGRESS_BAR_SYMBOL.repeat(numberOfDots);
    }

    private static void pause() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
