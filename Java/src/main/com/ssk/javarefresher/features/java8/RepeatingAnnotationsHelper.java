package main.com.ssk.javarefresher.features.java8;


public class RepeatingAnnotationsHelper {
    public static void main(String[] args) {
        RepeatingAnnotationsHelper rah = new RepeatingAnnotationsHelper();

        rah.updateFiles();

        // below wont work - we need process handler with required implementation.
        if(rah.getClass().isAnnotationPresent(RepeatingAnnotations.Notify.class)){
            RepeatingAnnotations.Notify notification=rah.getClass().getAnnotation(RepeatingAnnotations.Notify.class);
            System.out.println("Notification sent to - "+notification.email());
        }

    }


    @RepeatingAnnotations.Notify(email="author1@gmail.com")
    @RepeatingAnnotations.Notify(email="author2@gmail.com")
    private void updateFiles(){
        System.out.println("Updated file and notifications sent to all authors");
    }
}
