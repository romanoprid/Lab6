package ua.lviv.iot;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;


class BusRegularTest {

    @Test
    void replaceUnknownBusNumber() {
        String text = "bus#1 jefj bus1 fhk bus#723 ecr bus32 bus# fek BUS#21 bUs# BuS BUs bUs buS";
        InputStream in = new ByteArrayInputStream(text.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        String expected = "BUS_UNKNOWN jefj bus1 fhk BUS_UNKNOWN ecr bus32 bus# fek BUS_UNKNOWN bUs# BuS BUs bUs buS";
        String actual = BusRegular.replaceUnknownBusNumber(text, "BUS_UNKNOWN");
        assertEquals(expected, actual);
    }
}