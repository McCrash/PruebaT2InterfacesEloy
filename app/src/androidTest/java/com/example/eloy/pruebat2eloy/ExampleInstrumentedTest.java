package com.example.eloy.pruebat2eloy;


import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleInstrumentedTest extends ActivityInstrumentationTestCase2<MyLogin> {

    EditText et;
    Button btn_login;
    private MyLogin myLogin;

    public ExampleInstrumentedTest() {
        super(MyLogin.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        myLogin = getActivity();

        btn_login = (Button) myLogin.findViewById(R.id.btn_login);


    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    private static final String USERNAME = "ernesto";


    public void testLoginSignup() {
        TouchUtils.clickView(this, btn_login);

    }

}
