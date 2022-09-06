package exercises.technology;

import java.time.Instant;
import java.time.LocalDate;

public class LapTop extends Computer{
    private LocalDate dateCreated;

    public LapTop(int storage, int ram, boolean hasCamera,LocalDate dateCreated) {

        super(storage, ram, hasCamera);
        this.dateCreated= dateCreated;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated() {
        this.dateCreated = dateCreated;
    }
        public boolean isUpdated() {
            if(this.dateCreated.isAfter(LocalDate.now())){
                System.out.println("This model has been updated");
                return true;
            }
                else {
                    return false;
                }
            }

        }

