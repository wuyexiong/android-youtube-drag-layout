package tree.love.draglayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        setupViews();
	}

    private void setupViews() {
        findViewById(R.id.horizontal).setOnClickListener(this);
        findViewById(R.id.youtube_layout).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.horizontal:
                HorizontalDragActivity.launch(this);
                break;
            case R.id.youtube_layout:
                YoutubeActivity.launch(this);
                break;
        }
    }
}
