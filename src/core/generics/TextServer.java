package core.generics;

import java.util.HashMap;
import java.util.Map;

public class TextServer implements FileServer {
    private Map<String, String> data;

    public TextServer() {
        data = new HashMap<String, String>();
    }

    @Override
    public String downlaod(String file) {
        return data.get(file);
    }

    @Override
    public void save(String file, String string) throws Exception {
        data.put(file, string);
        System.out.println(FileServer.timeout);
    }

}
