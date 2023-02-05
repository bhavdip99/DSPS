package com.bhavdip.codesignal.test;

import com.bhavdip.codesignal.FirstNotRepeatingCharacter;
import org.junit.Assert;
import org.junit.Test;

public class FirstNotRepeatingCharacterTest {

    @Test
    public void solution_testReturnFromString_returnPositive() {

        FirstNotRepeatingCharacter firstNotRepeatingCharacter = new FirstNotRepeatingCharacter();

        Assert.assertEquals('c', firstNotRepeatingCharacter.solution("abacabad"));
    }

    @Test
    public void solution_testReturnFromString_returnNegative() {

        FirstNotRepeatingCharacter firstNotRepeatingCharacter = new FirstNotRepeatingCharacter();

        Assert.assertEquals('_', firstNotRepeatingCharacter.solution("abacabaabacaba"));
    }
}