package org.mozilla.android.sync.crypto.test;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import org.junit.Test;
import org.mozilla.android.sync.crypto.Cryptographer;
import org.mozilla.android.sync.crypto.KeyBundle;

public class TestKeyBundleUsernames {
  @Test
  public void testUsernames() throws NoSuchAlgorithmException, UnsupportedEncodingException {
    assertEquals(Cryptographer.sha1Base32("foobar@baz.com"), "xee7ffonluzpdp66l6xgpyh2v2w6ojkc");
    assertEquals(KeyBundle.usernameFromAccount("foobar@baz.com"), "xee7ffonluzpdp66l6xgpyh2v2w6ojkc");
    assertEquals(KeyBundle.usernameFromAccount("foobar"), "foobar");
  }
}
