/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hive.service.rpc.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
@org.apache.hadoop.hive.common.classification.InterfaceAudience.Public @org.apache.hadoop.hive.common.classification.InterfaceStability.Stable public class TArrayTypeEntry implements org.apache.thrift.TBase<TArrayTypeEntry, TArrayTypeEntry._Fields>, java.io.Serializable, Cloneable, Comparable<TArrayTypeEntry> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TArrayTypeEntry");

  private static final org.apache.thrift.protocol.TField OBJECT_TYPE_PTR_FIELD_DESC = new org.apache.thrift.protocol.TField("objectTypePtr", org.apache.thrift.protocol.TType.I32, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TArrayTypeEntryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TArrayTypeEntryTupleSchemeFactory());
  }

  private int objectTypePtr; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OBJECT_TYPE_PTR((short)1, "objectTypePtr");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // OBJECT_TYPE_PTR
          return OBJECT_TYPE_PTR;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __OBJECTTYPEPTR_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OBJECT_TYPE_PTR, new org.apache.thrift.meta_data.FieldMetaData("objectTypePtr", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TTypeEntryPtr")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TArrayTypeEntry.class, metaDataMap);
  }

  public TArrayTypeEntry() {
  }

  public TArrayTypeEntry(
    int objectTypePtr)
  {
    this();
    this.objectTypePtr = objectTypePtr;
    setObjectTypePtrIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TArrayTypeEntry(TArrayTypeEntry other) {
    __isset_bitfield = other.__isset_bitfield;
    this.objectTypePtr = other.objectTypePtr;
  }

  public TArrayTypeEntry deepCopy() {
    return new TArrayTypeEntry(this);
  }

  @Override
  public void clear() {
    setObjectTypePtrIsSet(false);
    this.objectTypePtr = 0;
  }

  public int getObjectTypePtr() {
    return this.objectTypePtr;
  }

  public void setObjectTypePtr(int objectTypePtr) {
    this.objectTypePtr = objectTypePtr;
    setObjectTypePtrIsSet(true);
  }

  public void unsetObjectTypePtr() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OBJECTTYPEPTR_ISSET_ID);
  }

  /** Returns true if field objectTypePtr is set (has been assigned a value) and false otherwise */
  public boolean isSetObjectTypePtr() {
    return EncodingUtils.testBit(__isset_bitfield, __OBJECTTYPEPTR_ISSET_ID);
  }

  public void setObjectTypePtrIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OBJECTTYPEPTR_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OBJECT_TYPE_PTR:
      if (value == null) {
        unsetObjectTypePtr();
      } else {
        setObjectTypePtr((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OBJECT_TYPE_PTR:
      return getObjectTypePtr();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OBJECT_TYPE_PTR:
      return isSetObjectTypePtr();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TArrayTypeEntry)
      return this.equals((TArrayTypeEntry)that);
    return false;
  }

  public boolean equals(TArrayTypeEntry that) {
    if (that == null)
      return false;

    boolean this_present_objectTypePtr = true;
    boolean that_present_objectTypePtr = true;
    if (this_present_objectTypePtr || that_present_objectTypePtr) {
      if (!(this_present_objectTypePtr && that_present_objectTypePtr))
        return false;
      if (this.objectTypePtr != that.objectTypePtr)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_objectTypePtr = true;
    list.add(present_objectTypePtr);
    if (present_objectTypePtr)
      list.add(objectTypePtr);

    return list.hashCode();
  }

  @Override
  public int compareTo(TArrayTypeEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetObjectTypePtr()).compareTo(other.isSetObjectTypePtr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetObjectTypePtr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.objectTypePtr, other.objectTypePtr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TArrayTypeEntry(");
    boolean first = true;

    sb.append("objectTypePtr:");
    sb.append(this.objectTypePtr);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetObjectTypePtr()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'objectTypePtr' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TArrayTypeEntryStandardSchemeFactory implements SchemeFactory {
    public TArrayTypeEntryStandardScheme getScheme() {
      return new TArrayTypeEntryStandardScheme();
    }
  }

  private static class TArrayTypeEntryStandardScheme extends StandardScheme<TArrayTypeEntry> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TArrayTypeEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OBJECT_TYPE_PTR
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.objectTypePtr = iprot.readI32();
              struct.setObjectTypePtrIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TArrayTypeEntry struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(OBJECT_TYPE_PTR_FIELD_DESC);
      oprot.writeI32(struct.objectTypePtr);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TArrayTypeEntryTupleSchemeFactory implements SchemeFactory {
    public TArrayTypeEntryTupleScheme getScheme() {
      return new TArrayTypeEntryTupleScheme();
    }
  }

  private static class TArrayTypeEntryTupleScheme extends TupleScheme<TArrayTypeEntry> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TArrayTypeEntry struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.objectTypePtr);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TArrayTypeEntry struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.objectTypePtr = iprot.readI32();
      struct.setObjectTypePtrIsSet(true);
    }
  }

}

