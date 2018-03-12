package ch.hslu.D1.Stack;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author fabio
 */
public class MainMethode {

    private static final Logger LOG = LogManager.getLogger(MainMethode.class);

    public static void main(final String[] args) {
        LOG.debug("Stack initialisieren");
        Stack newStack = new Stack(4);

        LOG.debug("Dem Stack werden 4 Strings hinzugefügt: toll,sind,Datenstrukturen,;P");
        String toll = "toll";
        String sind = "sind";
        String datenstrukturen = "Datenstrukturen";
        String smiley = ";P";

        newStack.push(smiley);
        newStack.push(toll);
        newStack.push(sind);
        newStack.push(datenstrukturen);
        
        
        LOG.debug("Elemente vom Stack abrufen");

        LOG.info(newStack.pop());
        LOG.info(newStack.pop());
        LOG.info(newStack.pop());
        LOG.info(newStack.pop());
        
        LOG.debug("Stack empty?: " + newStack.isEmpty());

        LOG.debug(("done"));
    }

}
