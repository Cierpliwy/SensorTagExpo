package host.exp.exponent;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;

import com.facebook.react.ReactPackage;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;

import org.unimodules.core.interfaces.Package;

import java.util.List;

import host.exp.exponent.experience.DetachActivity;
import host.exp.exponent.generated.DetachBuildConstants;

public class MainActivity extends DetachActivity implements PermissionAwareActivity {

  @Override
  public String publishedUrl() {
    return "exp://exp.host/@cierpliwy/SensorTagExpo";
  }

  @Override
  public String developmentUrl() {
    return DetachBuildConstants.DEVELOPMENT_URL;
  }

  @Override
  public List<ReactPackage> reactPackages() {
    return ((MainApplication) getApplication()).getPackages();
  }

  @Override
  public List<Package> expoPackages() {
    return ((MainApplication) getApplication()).getExpoPackages();
  }

  @Override
  public boolean isDebug() {
    return BuildConfig.DEBUG;
  }

  @Override
  public Bundle initialProps(Bundle expBundle) {
    // Add extra initialProps here
    return expBundle;
  }

  @TargetApi(Build.VERSION_CODES.M)
  @Override
  public void requestPermissions(String[] permissions, int requestCode, PermissionListener listener) {
    requestPermissions(permissions, requestCode);
  }
}
