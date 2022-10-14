import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.FileHandle;
import view.Menu;
import view.MenuError;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileHandleTest {

    FileHandle fileHandle = new FileHandle();
//    MenuError menu = new MenuError();
//    Scanner input = new Scanner(System.in);

    @Test
    void readFileSuccessTest() {
        Assertions.assertDoesNotThrow(() -> fileHandle.readFile());
    }
}

//    @Test
//    void menu_ExitInput() {
//        String input = "0";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//        menu.showMenu(new Scanner(input));
//    }

//    void menu_NullInput() {
//        Assertions.assertThrows(InputMismatchException.class, () -> menu.showMenu(new Scanner("null")));
//  }

