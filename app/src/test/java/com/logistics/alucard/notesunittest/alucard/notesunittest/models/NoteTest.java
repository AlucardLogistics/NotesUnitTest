package com.logistics.alucard.notesunittest.alucard.notesunittest.models;

import com.logistics.alucard.notesunittest.models.Note;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class NoteTest {

    private static final String TIMESTAMP_1 = "05-2019";
    private static final String TIMESTAMP_2 = "06-2019";

    @Test
    void isNotesEqual_identicalProperties_returnTrue() throws Exception {
        //Arrange
        Note note1 = new Note("Note #1", "Content of note #1, ", TIMESTAMP_1);
        note1.setId(1);
        Note note2 = new Note("Note #1", "Content of note #1, ", TIMESTAMP_1);
        note2.setId(1);

        //Act

        //Assert
        assertEquals(note1, note2);
        System.out.println("The notes are equal!");
    }

    @Test
    void isNotesEqual_differentIds_returnFalse() throws Exception {
        //Arrange
        Note note1 = new Note("Note #1", "Content of note #1, ", TIMESTAMP_1);
        note1.setId(1);
        Note note2 = new Note("Note #1", "Content of note #1, ", TIMESTAMP_1);
        note2.setId(2);
        //Act

        //Assert
        assertNotEquals(note1, note2);
        System.out.println("The notes are NOT equal!");
    }

    @Test
    void isNotesEqual_differentTimestamps_returnTrue() throws Exception {
        //Arrange
        Note note1 = new Note("Note #1", "Content of note #1, ", TIMESTAMP_1);
        note1.setId(1);
        Note note2 = new Note("Note #1", "Content of note #1, ", TIMESTAMP_2);
        note2.setId(1);

        //Act

        //Assert
        assertEquals(note1, note2);
        System.out.println("The notes timestamps are NOT equal!");
    }

    @Test
    void isNotesEqual_differentTitles_returnFalse() throws Exception {
        //Arrange
        Note note1 = new Note("Note #1", "Content of note #1, ", TIMESTAMP_1);
        note1.setId(1);
        Note note2 = new Note("Note #2", "Content of note #1, ", TIMESTAMP_1);
        note2.setId(1);

        //Act

        //Assert
        assertNotEquals(note1, note2);
        System.out.println("The notes title are NOT equal!");
    }

    @Test
    void isNotesEqual_differentContents_returnFalse() throws Exception {
        //Arrange
        Note note1 = new Note("Note #1", "Content of note #1, ", TIMESTAMP_1);
        note1.setId(1);
        Note note2 = new Note("Note #1", "Content of note #2, ", TIMESTAMP_1);
        note2.setId(1);

        //Act

        //Assert
        assertNotEquals(note1, note2);
        System.out.println("The notes content are NOT equal!");
    }
}
