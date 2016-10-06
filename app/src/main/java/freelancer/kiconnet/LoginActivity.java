package freelancer.kiconnet;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import butterknife.OnClick;

/**
 * Created by nqlong on 06-Oct-16.
 */
public class LoginActivity extends AbstractActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @OnClick(R.id.login_btn)
    public void returnMain() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP|
                Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    @Override
    protected int getLayoutId() {
        return R.layout.login_activity;
    }
}
