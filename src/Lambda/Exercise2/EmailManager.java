package Lambda.Exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmailManager {
    public static void main(String[] args) {
        List<Email> emailList = createEmailList();
        //tylko wysłane emaile
        List<Email> sentEmails = filterEmails(emailList, p -> p.isSent());
        System.out.println("Wysłane maile:");
        System.out.println(sentEmails);
        //filtrowanie maili, w których nadawca lub odbiorca ma wskazany adres email
        List<Email> bartEmails = filterEmails(emailList, p -> p.getSender().equals("bart@example.com"));
        System.out.println("Maile przefiltrowane na podstawie nadawcy lub odbiorcy");
        System.out.println(bartEmails);
    }

    private static <T> List<T> filterEmails(List<T> emails, Predicate<T> predicate) {
        List<T> filteredEmail = new ArrayList<>();
        for (T email : emails) {
            if (predicate.test(email)) {
                filteredEmail.add(email);
            }
        }
        return filteredEmail;
    }

//    private static List<Email> filterEmailsBySenderOrRecipient(List<Email> emails, String emailAddress) {
//        List<Email> filteredEmails = new ArrayList<>();
//        for (Email email : emails) {
//            if (email.getSender().equals(emailAddress) || email.getRecipient().equals(emailAddress))
//                filteredEmails.add(email);
//        }
//        return filteredEmails;
//    }
//
//    private static List<Email> filterEmailsSent(List<Email> emails) {
//        List<Email> sentEmails = new ArrayList<>();
//        for (Email email : emails) {
//            if (email.isSent())
//                sentEmails.add(email);
//        }
//        return sentEmails;
//    }

    private static List<Email> createEmailList() {
        List<Email> emails = new ArrayList<>();
        emails.add(new Email(
                "joe@example.com",
                "barbara@example.com",
                "Kup bułki",
                "Cześć!, Kup proszę bułki, gdy będziesz wracać z pracy.",
                false)
        );
        emails.add(new Email(
                "carl@example.com",
                "joe@example.com",
                "Nowa inwestycja",
                "Siema! Musimy omówić temat nowej inwestycji, pasuje Ci jutro?",
                true)
        );
        emails.add(new Email(
                "joe@example.com",
                "bart@example.com",
                "Wypad na miasto",
                "Cześć. Idziemy dzisiaj wieczorem z chłopakami na miasto. Dołączasz do nas?",
                true)
        );
        return emails;
    }
}
