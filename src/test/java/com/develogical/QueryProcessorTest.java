package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsTeamName() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("dlxiao"));
    }

    @Test
    public void knowsAboutNewQuery() throws Exception {
        assertThat(queryProcessor.process("newquery"), containsString("New query!"));
    }

    // @Test
    // public void knowsAboutLargest() throws Exception {
    //     assertThat(queryProcessor.process("which of the following numbers is the largest: 83, 91, 155, 918"), containsString("918"));
    // }

    @Test
    public void knowsAboutPlus() throws Exception {
        assertThat(queryProcessor.process("What is 12 plus 23"), containsString("35"));
    }
}
