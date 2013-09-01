package tree.love.draglayout;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/** Created by wuyexiong on 13-8-31. */
public class HorizontalDragActivity extends Activity {

    public static void launch(Context context)
    {
        Intent intent = new Intent(context, HorizontalDragActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal);
    }
}
