package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.omnit_000.testproject.MyActivity;
import com.example.omnit_000.testproject.R;

/**
 * Created by Omnit_000 on 4/18/2016.
 */
public class JUnit_Test extends ActivityInstrumentationTestCase2{
    MyActivity myActivity;

    public JUnit_Test() {
        super(MyActivity.class);
    }

    public void test_first(){
        myActivity = (MyActivity) getActivity();

        TextView textView = (TextView) myActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Bye World", tester);
    }
}
