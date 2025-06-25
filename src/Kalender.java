

public class Kalender {
    /** Namen der Monate (Deutsch) */
    private static final String[] MONATE = {
            "Januar", "Februar", "März", "April", "Mai", "Juni",
            "Juli", "August", "September", "Oktober", "November", "Dezember"
    };

    /** Tage pro Monat (nicht-Schaltjahr) */
    private static final int[] TAGE_PRO_MONAT = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    /** Wochentag-Köpfe */
    private static final String WOCHENTAGE = "Mo Di Mi Do Fr Sa So";

    public static void main(String[] args) {
        int ersterWochentag = 0; // 0 = Montag, weil das Jahr mit Montag beginnt

        for (int m = 0; m < 12; m++) {
            System.out.println(MONATE[m]);
            System.out.println(WOCHENTAGE);

            int tageImMonat = TAGE_PRO_MONAT[m];
            // Leerstellen für Tage vor dem 1. des Monats
            for (int i = 0; i < ersterWochentag; i++) {
                System.out.print("   ");           // drei Leerzeichen (zwei für Feld, eins als Abstand)
            }

            for (int tag = 1; tag <= tageImMonat; tag++) {
                System.out.printf("%2d ", tag);    // zweistellig rechtsbündig
                ersterWochentag = (ersterWochentag + 1) % 7;

                if (ersterWochentag == 0 && tag != tageImMonat) {
                    System.out.println();          // Zeilenumbruch am Wochenende (So → Mo)
                }
            }
            System.out.println("\n");              // Leerzeile zwischen den Monaten
        }
    }
}