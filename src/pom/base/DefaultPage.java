package pom.base;

public interface DefaultPage {
    /**
     * Interface Method to post url from config.properties file.
     * @return [String]
     */
    <T> String getUrl(T... values);

    /**
     * Interface Method to visit a page using getUrl() method for the page.
     */
    <T> void load(T... values);
}
