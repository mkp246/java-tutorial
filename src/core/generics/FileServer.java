package core.generics;

public interface FileServer {
    int timeout = 30;
    String downlaod(String file) throws Exception;
    void save(String file, String string) throws Exception;
}
