package CaseStudy.validate;

import CaseStudy.ultils.UserException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class validator {
    public static LocalDate validateBirthday(String birthdayAsString) throws UserException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        LocalDate birthday= null;
        try {
          //  birthday = format.parse(birthdayAsString);
            LocalDate birthDay = LocalDate.parse(birthdayAsString);
            LocalDate now = LocalDate.now();

            if(now.getYear() - birthday.getYear() < 18 || now.getYear() - birthday.getYear() > 100){
                throw new UserException(Message.AGE_LESS_THAN);
            }

            return birthday;

        } catch (Exception e) {
            throw new UserException(Message.DATE_FORMAT);
        }

    }
}
