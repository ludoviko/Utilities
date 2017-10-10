package com.lam.utilString;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Usuario on 10/10/2017.
 */
@RunWith(Parameterized.class)
public class ReverseTest {
    private String input;
    private String expected;

    public ReverseTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test(timeout=3000)
    public void testFactorial() {
        assertThat(Reverse.reverse(input), is(expected));
    }

    @Parameterized.Parameters(name = " {index}: Reverse.reverse( {0} ) = {1} ")
    public static Collection<Object[]> data() {
        return Arrays.asList( new Object[][] {
                {"four score and seven years ago", ( "oga sraey neves dna erocs ruof")},
                {"a",  "a"},
                {"ab",  "ba"},
                {"abc",  "cba"},
                {"dlrow olleH",  "Hello world"},
                { "Hello world", "dlrow olleH"},
                {null, null },
                {"",  ""}
        });
    };
}

