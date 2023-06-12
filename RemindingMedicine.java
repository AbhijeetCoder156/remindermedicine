package practice;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class RemindingMedicine {
	 private Timer timer;

	    public RemindingMedicine() {
	        timer = new Timer();
	    }

	    public void setReminder(int hours, int minutes) {
	        Date reminderTime = new Date();
	        reminderTime.setHours(hours);
	        reminderTime.setMinutes(minutes);
	        reminderTime.setSeconds(0);

	        timer.schedule(new TimerTask() {
	            @Override
	            public void run() {
	                remindUser();
	            }
	        }, reminderTime);
	    }

	    private void remindUser() {
	        // Display a reminder message on the user's screen
	        System.out.println("Its time to take your medicine!");
	        // You can customize the reminder message or even play an alarm sound

	        // Schedule the next reminder
	        setReminder(8, 0); // Example: Set the next reminder at 8:00 AM
	    }

	    public static void main(String[] args) {
	    	RemindingMedicine app = new RemindingMedicine();
	        app.setReminder(5, 0); // Set the initial reminder at 8:00 AM
	    }
	}




