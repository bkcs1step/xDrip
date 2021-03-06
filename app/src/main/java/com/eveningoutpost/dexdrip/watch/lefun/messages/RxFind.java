package com.eveningoutpost.dexdrip.watch.lefun.messages;

// jamorham

public class RxFind extends BaseRx {

    public static byte opcode = 0x0A;

    {
        length = 4;
    }

    @Override
    public BaseRx fromBytes(final byte[] bytes) {

        this.bytes = bytes;

        if (!validate(opcode)) {
            return null;
        }

        return this;
    }

}
