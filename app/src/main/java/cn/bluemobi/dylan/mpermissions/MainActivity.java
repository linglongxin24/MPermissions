package cn.bluemobi.dylan.mpermissions;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends MPermissionsActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 打电话
     *
     * @param view
     */
    public void onClick1(View view) {
        requestPermission(new String[]{Manifest.permission.CALL_PHONE}, 0x0001);
    }

    /**
     * 写SD卡
     *
     * @param view
     */
    public void onClick2(View view) {
        requestPermission(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 0x0002);
    }

    /**
     * 拍照
     *
     * @param view
     */
    public void onClick3(View view) {
        requestPermission(new String[]{Manifest.permission.CAMERA}, 0x0003);
    }

    /**
     * 权限成功回调函数
     *
     * @param requestCode
     */
    @Override
    public void permissionSuccess(int requestCode) {
        super.permissionSuccess(requestCode);
        switch (requestCode) {
            case 0x0001:
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:13468857714"));
                startActivity(intent);
                break;
        }

    }

}
