package com.example.test4.view

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView


class TitleLayout(context: Context?, attrs: AttributeSet?) :
    LinearLayout(context, attrs) {
    init {
        // 设置标题栏布局为水平方向
        orientation = HORIZONTAL

        // 添加返回按钮
        val backButton = Button(context)
        backButton.text = "返回"
        backButton.setOnClickListener { // 销毁当前Activity
            if (context is Activity) {
                context.finish()
            }
        }
        // 添加返回按钮到标题栏
        addView(backButton)

        // 添加标题
        val titleView = TextView(context)
        titleView.text = "HUAWEI STORES"
        titleView.textSize = 20f // 设置标题字体大小
        val layoutParams = LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f)
        titleView.layoutParams = layoutParams
        titleView.gravity = TEXT_ALIGNMENT_CENTER // 设置标题居中
        addView(titleView)

        // 添加编辑按钮
        val editButton = Button(context)
        editButton.text = "编辑"
        // 添加编辑按钮到标题栏
        addView(editButton)
    }
}

