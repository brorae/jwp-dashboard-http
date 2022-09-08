package org.apache.catalina.startup.session;

import java.util.HashMap;
import java.util.Map;

public class Session {

    private final String id;
    private final Map<String, Object> values;

    public Session(final String id) {
        this.id = id;
        values = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public Object getAttribute(final String name) {
        return values.get(name);
    }

    public void setAttribute(final String name, final Object value) {
        values.put(name, value);
    }

    @Override
    public String toString() {
        return "Session{" +
                "id='" + id + '\'' +
                ", values=" + values +
                '}';
    }
}