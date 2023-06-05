package com.layout;

import com.controllers.Read;

import javax.sql.rowset.serial.SerialException;
import java.sql.SQLException;

public class ReadLayout {
    public static void layout() throws SQLException {
        Read.getDatabase();
    }
}
