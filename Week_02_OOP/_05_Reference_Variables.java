public class _05_Reference_Variables {

    String movieName;

    void displayMovie() {

        System.out.println("Movie : " + movieName);
        System.out.println();

    }

    public static void main(String[] args) {

        _05_Reference_Variables movie1 =
                new _05_Reference_Variables();

        movie1.movieName = "Interstellar";

        _05_Reference_Variables movie2 = movie1;

        movie2.movieName = "Inception";

        movie1.displayMovie();
        movie2.displayMovie();

    }

}