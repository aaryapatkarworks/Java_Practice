class Video {

    void play() {

        System.out.println("Playing Video");

    }

}

class Movie extends Video {

    @Override
    void play() {

        System.out.println("Playing Movie");

    }

}

public class _10_Runtime_Polymorphism {

    public static void main(String[] args) {

        Video video = new Movie();

        video.play();

    }

}