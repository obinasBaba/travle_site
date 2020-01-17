<?xml version="1.0" encoding="utf-8"?>
<androidx.coordinatorlayout.widget.CoordinatorLayout

        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity">

    <com.google.android.material.appbar.AppBarLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:id="@+id/appBarLayout_ID"
            android:keepScreenOn="true"
            android:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar"
            >

        <androidx.appcompat.widget.Toolbar
                android:id="@+id/toolbar"
                android:layout_width="match_parent"
                android:layout_height="?attr/actionBarSize"

                app:titleTextColor="@color/colorAccent"

                app:layout_scrollFlags="scroll|enterAlways"
                android:background="@color/colorPrimary"
                android:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar"
                />

        <com.google.android.material.tabs.TabLayout
                android:id="@+id/tabs"
                app:tabGravity="fill"
                app:tabUnboundedRipple="true"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                app:tabSelectedTextColor="@color/custom1"
                />
    </com.google.android.material.appbar.AppBarLayout>

    <androidx.viewpager.widget.ViewPager
            android:id="@+id/viewPager"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_below="@+id/appBarLayout_ID"
            android:layout_marginTop="0dp"
            app:layout_behavior="@string/appbar_scrolling_view_behavior">

    </androidx.viewpager.widget.ViewPager>


</androidx.coordinatorlayout.widget.CoordinatorLayout>