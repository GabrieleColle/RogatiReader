package rogatireader;

import java.time.LocalDateTime;

/**
 *
 * @author busat
 */
public class Action {
    public static enum ActionType{entra, esce};
    
    private ActionType type;
    private LocalDateTime dateTime;
    
    public Action(ActionType type, LocalDateTime dateTime){
        this.type = type;
        this.dateTime = dateTime;
    }

    public ActionType getType() {
        return type;
    }

    public void setType(ActionType type) {
        this.type = type;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
