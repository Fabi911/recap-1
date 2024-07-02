import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void isValidLengthTest_when8_thenReturnTrue(){
        //given
        String password="password";
        //when
        boolean actual = Main.isValidLength(password);
        //then
        assertTrue(actual);
    }
    @Test
    public void isValidLengthTest_when4_thenReturnFalse(){
        //given
        String password="word";
        //when
        boolean actual = Main.isValidLength(password);
        //then
        assertFalse(actual);
    }
    @Test
    public void containsDigitTest_whenHasNumber_thenReturnTrue(){
        //given
        String password="password1";
        //when
        boolean actual = Main.containsDigit(password);
        //then
        assertTrue(actual);

    }
    @Test
    public void containsDigitTest_whenHasNoNumber_thenReturnFalse(){
        //given
        String password="password";
        //when
        boolean actual = Main.containsDigit(password);
        //then
        assertFalse(actual);

    }
    @Test
    public void containsUpperAndLowerCaseTest_whenHasUpperAndLower_thenReturnTrue(){
        //given
        String password="Password";
        //when
        boolean actual= Main.containsUpperAndLowerCase(password);
        //then
        assertTrue(actual);
    }
    @Test
    public void containsUpperAndLowerCaseTest_whenHasUpper_thenReturnFalse(){
        //given
        String password="PASSWORD";
        //when
        boolean actual= Main.containsUpperAndLowerCase(password);
        //then
        assertFalse(actual);
    }
    @Test
    public void containsUpperAndLowerCaseTest_whenHasLower_thenReturnFalse(){
        //given
        String password="password";
        //when
        boolean actual= Main.containsUpperAndLowerCase(password);
        //then
        assertFalse(actual);
    }
    @Test
    public void isWeakPasswordTest_whenPasswordIsWeak_thenReturnTrue(){
        String password="Password1";
        boolean actual=Main.isWeakPassword(password);
        assertTrue(actual);
    }

}