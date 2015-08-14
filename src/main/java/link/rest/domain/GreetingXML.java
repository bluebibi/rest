package link.rest.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by yhhan on 15. 8. 12..
 */
@XmlRootElement(name = "Greeting")
public class GreetingXML {
    private long id;
    private String content;

    public GreetingXML() {
    }

    public GreetingXML(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @XmlElement
    public long getId() {
        return id;
    }

    @XmlElement
    public String getContent() {
        return content;
    }
}
