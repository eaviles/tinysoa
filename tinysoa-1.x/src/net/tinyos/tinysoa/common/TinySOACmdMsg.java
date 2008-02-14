/*
 *  Copyright 2006 Edgardo Avil�s L�pez
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *    
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * 
 ******************************************************************************/

package net.tinyos.tinysoa.common;

/*******************************************************************************
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'TinySOACmdMsg'
 * message type.
 * 
 * @author		Edgardo Avil�s L�pez
 * @version	0.3, 07/24/2006
 ******************************************************************************/

public class TinySOACmdMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 11;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 25;

    /** Create a new TinySOACmdMsg of size 4. */
    public TinySOACmdMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new TinySOACmdMsg of the given data_length. */
    public TinySOACmdMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new TinySOACmdMsg with the given data_length
     * and base offset.
     */
    public TinySOACmdMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new TinySOACmdMsg using the given byte array
     * as backing store.
     */
    public TinySOACmdMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new TinySOACmdMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public TinySOACmdMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new TinySOACmdMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public TinySOACmdMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new TinySOACmdMsg embedded in the given message
     * at the given base offset.
     */
    public TinySOACmdMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new TinySOACmdMsg embedded in the given message
     * at the given base offset and length.
     */
    public TinySOACmdMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <TinySOACmdMsg> \n";
      try {
        s += "  [data=0x"+Long.toHexString(get_data())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [type=0x"+Long.toHexString(get_type())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [id=0x"+Long.toHexString(get_id())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: data
    //   Field type: int, unsigned
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'data' is signed (false).
     */
    public static boolean isSigned_data() {
        return false;
    }

    /**
     * Return whether the field 'data' is an array (false).
     */
    public static boolean isArray_data() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'data'
     */
    public static int offset_data() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'data'
     */
    public static int offsetBits_data() {
        return 0;
    }

    /**
     * Return the value (as a int) of the field 'data'
     */
    public int get_data() {
        return (int)getUIntElement(offsetBits_data(), 16);
    }

    /**
     * Set the value of the field 'data'
     */
    public void set_data(int value) {
        setUIntElement(offsetBits_data(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'data'
     */
    public static int size_data() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'data'
     */
    public static int sizeBits_data() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: type
    //   Field type: short, unsigned
    //   Offset (bits): 16
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'type' is signed (false).
     */
    public static boolean isSigned_type() {
        return false;
    }

    /**
     * Return whether the field 'type' is an array (false).
     */
    public static boolean isArray_type() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'type'
     */
    public static int offset_type() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'type'
     */
    public static int offsetBits_type() {
        return 16;
    }

    /**
     * Return the value (as a short) of the field 'type'
     */
    public short get_type() {
        return (short)getUIntElement(offsetBits_type(), 8);
    }

    /**
     * Set the value of the field 'type'
     */
    public void set_type(short value) {
        setUIntElement(offsetBits_type(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'type'
     */
    public static int size_type() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'type'
     */
    public static int sizeBits_type() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: id
    //   Field type: short, unsigned
    //   Offset (bits): 24
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'id' is signed (false).
     */
    public static boolean isSigned_id() {
        return false;
    }

    /**
     * Return whether the field 'id' is an array (false).
     */
    public static boolean isArray_id() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'id'
     */
    public static int offset_id() {
        return (24 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'id'
     */
    public static int offsetBits_id() {
        return 24;
    }

    /**
     * Return the value (as a short) of the field 'id'
     */
    public short get_id() {
        return (short)getUIntElement(offsetBits_id(), 8);
    }

    /**
     * Set the value of the field 'id'
     */
    public void set_id(short value) {
        setUIntElement(offsetBits_id(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'id'
     */
    public static int size_id() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'id'
     */
    public static int sizeBits_id() {
        return 8;
    }

}
