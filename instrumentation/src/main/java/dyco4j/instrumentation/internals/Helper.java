/*
 * Copyright (c) 2016, Venkatesh-Prasad Ranganath
 *
 * BSD 3-clause License
 *
 * Author: Venkatesh-Prasad Ranganath (rvprasad)
 */

package dyco4j.instrumentation.internals;

class Helper {
    static String createJavaName(final String name, final String owner) {
        return owner.replace("/", ".") + "." + name;
    }

    static String createNameDesc(final String name, final String owner, final String desc, final boolean isStatic,
                                 final boolean isPublished) {
        return owner + "/" + name + ":" + desc + ":" + (isStatic ? "S" : "I") + ":" + (isPublished ? "+" : "-");
    }

    static String createShortNameDesc(final String name, final String owner, final String desc) {
        return owner + "/" + name + ":" + desc;
    }

    static String createShortNameDesc(final String nameDesc) {
        final String[] tmp = nameDesc.split(":");
        return tmp[0] + ":" + tmp[1];
    }
}