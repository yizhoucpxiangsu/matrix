package com.tencent.matrix.trace;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.commons.JSRInlinerAdapter;

/**
 * author : <a href="https://yibs.space"/>
 * e-mail : yibaoshan@foxmail.com
 * time   : 2024/01/11
 */
public class JSRAdapter extends JSRInlinerAdapter {
    JSRAdapter(int api, MethodVisitor mv, int access, String name, String desc, String signature, String[] exceptions) {
        super(api, mv, access, name, desc, signature, exceptions);
    }
}