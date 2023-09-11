package efective.generic;

public class Main {

    public static void main(String[] args) {
        testFavorite();
    }

    static void testFavorite() {
        Favorites favorites = new Favorites();
        favorites.putFavorite(String.class, "String");
        favorites.putFavorite(Integer.class, Integer.MAX_VALUE);
        favorites.putFavorite(Class.class, Favorites.class);

        String favoriteString = favorites.getFavorite(String.class);
        Integer favoriteInteger = favorites.getFavorite(Integer.class);
        Class<?> favoritesClass = favorites.getFavorite(Class.class);

        System.out.printf("%s %x %s%n", favoriteString, favoriteInteger, favoritesClass);
    }
}
