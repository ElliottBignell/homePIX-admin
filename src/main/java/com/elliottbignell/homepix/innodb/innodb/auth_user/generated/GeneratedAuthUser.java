package com.elliottbignell.homepix.innodb.innodb.auth_user.generated;

import com.elliottbignell.homepix.innodb.innodb.auth_user.AuthUser;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.enterprise.datastore.runtime.field.DatastoreFields;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.util.Optional;

/**
 * The generated base for the {@link
 * com.elliottbignell.homepix.innodb.innodb.auth_user.AuthUser}-interface
 * representing entities of the {@code auth_user}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAuthUser {
    
    /**
     * This Field corresponds to the {@link AuthUser} field that can be obtained
     * using the {@link AuthUser#getId()} method.
     */
    ComparableField<AuthUser, Byte, Byte> ID = DatastoreFields.createComparableField(
        Identifier.ID,
        o -> OptionalUtil.unwrap(o.getId()),
        AuthUser::setId,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link AuthUser} field that can be obtained
     * using the {@link AuthUser#getPassword()} method.
     */
    StringField<AuthUser, String> PASSWORD = DatastoreFields.createStringField(
        Identifier.PASSWORD,
        o -> OptionalUtil.unwrap(o.getPassword()),
        AuthUser::setPassword,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link AuthUser} field that can be obtained
     * using the {@link AuthUser#getLastLogin()} method.
     */
    StringField<AuthUser, String> LAST_LOGIN = DatastoreFields.createStringField(
        Identifier.LAST_LOGIN,
        o -> OptionalUtil.unwrap(o.getLastLogin()),
        AuthUser::setLastLogin,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link AuthUser} field that can be obtained
     * using the {@link AuthUser#getIsSuperuser()} method.
     */
    ComparableField<AuthUser, Byte, Byte> IS_SUPERUSER = DatastoreFields.createComparableField(
        Identifier.IS_SUPERUSER,
        o -> OptionalUtil.unwrap(o.getIsSuperuser()),
        AuthUser::setIsSuperuser,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link AuthUser} field that can be obtained
     * using the {@link AuthUser#getUsername()} method.
     */
    StringField<AuthUser, String> USERNAME = DatastoreFields.createStringField(
        Identifier.USERNAME,
        o -> OptionalUtil.unwrap(o.getUsername()),
        AuthUser::setUsername,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link AuthUser} field that can be obtained
     * using the {@link AuthUser#getLastName()} method.
     */
    StringField<AuthUser, String> LAST_NAME = DatastoreFields.createStringField(
        Identifier.LAST_NAME,
        o -> OptionalUtil.unwrap(o.getLastName()),
        AuthUser::setLastName,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link AuthUser} field that can be obtained
     * using the {@link AuthUser#getEmail()} method.
     */
    StringField<AuthUser, String> EMAIL = DatastoreFields.createStringField(
        Identifier.EMAIL,
        o -> OptionalUtil.unwrap(o.getEmail()),
        AuthUser::setEmail,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link AuthUser} field that can be obtained
     * using the {@link AuthUser#getIsStaff()} method.
     */
    ComparableField<AuthUser, Byte, Byte> IS_STAFF = DatastoreFields.createComparableField(
        Identifier.IS_STAFF,
        o -> OptionalUtil.unwrap(o.getIsStaff()),
        AuthUser::setIsStaff,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link AuthUser} field that can be obtained
     * using the {@link AuthUser#getIsActive()} method.
     */
    ComparableField<AuthUser, Byte, Byte> IS_ACTIVE = DatastoreFields.createComparableField(
        Identifier.IS_ACTIVE,
        o -> OptionalUtil.unwrap(o.getIsActive()),
        AuthUser::setIsActive,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link AuthUser} field that can be obtained
     * using the {@link AuthUser#getDateJoined()} method.
     */
    StringField<AuthUser, String> DATE_JOINED = DatastoreFields.createStringField(
        Identifier.DATE_JOINED,
        o -> OptionalUtil.unwrap(o.getDateJoined()),
        AuthUser::setDateJoined,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link AuthUser} field that can be obtained
     * using the {@link AuthUser#getFirstName()} method.
     */
    StringField<AuthUser, String> FIRST_NAME = DatastoreFields.createStringField(
        Identifier.FIRST_NAME,
        o -> OptionalUtil.unwrap(o.getFirstName()),
        AuthUser::setFirstName,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the id of this AuthUser. The id field corresponds to the database
     * column innodb.innodb.auth_user.id.
     * 
     * @return the id of this AuthUser
     */
    Optional<Byte> getId();
    
    /**
     * Returns the password of this AuthUser. The password field corresponds to
     * the database column innodb.innodb.auth_user.password.
     * 
     * @return the password of this AuthUser
     */
    Optional<String> getPassword();
    
    /**
     * Returns the lastLogin of this AuthUser. The lastLogin field corresponds
     * to the database column innodb.innodb.auth_user.last_login.
     * 
     * @return the lastLogin of this AuthUser
     */
    Optional<String> getLastLogin();
    
    /**
     * Returns the isSuperuser of this AuthUser. The isSuperuser field
     * corresponds to the database column innodb.innodb.auth_user.is_superuser.
     * 
     * @return the isSuperuser of this AuthUser
     */
    Optional<Byte> getIsSuperuser();
    
    /**
     * Returns the username of this AuthUser. The username field corresponds to
     * the database column innodb.innodb.auth_user.username.
     * 
     * @return the username of this AuthUser
     */
    Optional<String> getUsername();
    
    /**
     * Returns the lastName of this AuthUser. The lastName field corresponds to
     * the database column innodb.innodb.auth_user.last_name.
     * 
     * @return the lastName of this AuthUser
     */
    Optional<String> getLastName();
    
    /**
     * Returns the email of this AuthUser. The email field corresponds to the
     * database column innodb.innodb.auth_user.email.
     * 
     * @return the email of this AuthUser
     */
    Optional<String> getEmail();
    
    /**
     * Returns the isStaff of this AuthUser. The isStaff field corresponds to
     * the database column innodb.innodb.auth_user.is_staff.
     * 
     * @return the isStaff of this AuthUser
     */
    Optional<Byte> getIsStaff();
    
    /**
     * Returns the isActive of this AuthUser. The isActive field corresponds to
     * the database column innodb.innodb.auth_user.is_active.
     * 
     * @return the isActive of this AuthUser
     */
    Optional<Byte> getIsActive();
    
    /**
     * Returns the dateJoined of this AuthUser. The dateJoined field corresponds
     * to the database column innodb.innodb.auth_user.date_joined.
     * 
     * @return the dateJoined of this AuthUser
     */
    Optional<String> getDateJoined();
    
    /**
     * Returns the firstName of this AuthUser. The firstName field corresponds
     * to the database column innodb.innodb.auth_user.first_name.
     * 
     * @return the firstName of this AuthUser
     */
    Optional<String> getFirstName();
    
    /**
     * Sets the id of this AuthUser. The id field corresponds to the database
     * column innodb.innodb.auth_user.id.
     * 
     * @param id to set of this AuthUser
     * @return   this AuthUser instance
     */
    AuthUser setId(Byte id);
    
    /**
     * Sets the password of this AuthUser. The password field corresponds to the
     * database column innodb.innodb.auth_user.password.
     * 
     * @param password to set of this AuthUser
     * @return         this AuthUser instance
     */
    AuthUser setPassword(String password);
    
    /**
     * Sets the lastLogin of this AuthUser. The lastLogin field corresponds to
     * the database column innodb.innodb.auth_user.last_login.
     * 
     * @param lastLogin to set of this AuthUser
     * @return          this AuthUser instance
     */
    AuthUser setLastLogin(String lastLogin);
    
    /**
     * Sets the isSuperuser of this AuthUser. The isSuperuser field corresponds
     * to the database column innodb.innodb.auth_user.is_superuser.
     * 
     * @param isSuperuser to set of this AuthUser
     * @return            this AuthUser instance
     */
    AuthUser setIsSuperuser(Byte isSuperuser);
    
    /**
     * Sets the username of this AuthUser. The username field corresponds to the
     * database column innodb.innodb.auth_user.username.
     * 
     * @param username to set of this AuthUser
     * @return         this AuthUser instance
     */
    AuthUser setUsername(String username);
    
    /**
     * Sets the lastName of this AuthUser. The lastName field corresponds to the
     * database column innodb.innodb.auth_user.last_name.
     * 
     * @param lastName to set of this AuthUser
     * @return         this AuthUser instance
     */
    AuthUser setLastName(String lastName);
    
    /**
     * Sets the email of this AuthUser. The email field corresponds to the
     * database column innodb.innodb.auth_user.email.
     * 
     * @param email to set of this AuthUser
     * @return      this AuthUser instance
     */
    AuthUser setEmail(String email);
    
    /**
     * Sets the isStaff of this AuthUser. The isStaff field corresponds to the
     * database column innodb.innodb.auth_user.is_staff.
     * 
     * @param isStaff to set of this AuthUser
     * @return        this AuthUser instance
     */
    AuthUser setIsStaff(Byte isStaff);
    
    /**
     * Sets the isActive of this AuthUser. The isActive field corresponds to the
     * database column innodb.innodb.auth_user.is_active.
     * 
     * @param isActive to set of this AuthUser
     * @return         this AuthUser instance
     */
    AuthUser setIsActive(Byte isActive);
    
    /**
     * Sets the dateJoined of this AuthUser. The dateJoined field corresponds to
     * the database column innodb.innodb.auth_user.date_joined.
     * 
     * @param dateJoined to set of this AuthUser
     * @return           this AuthUser instance
     */
    AuthUser setDateJoined(String dateJoined);
    
    /**
     * Sets the firstName of this AuthUser. The firstName field corresponds to
     * the database column innodb.innodb.auth_user.first_name.
     * 
     * @param firstName to set of this AuthUser
     * @return          this AuthUser instance
     */
    AuthUser setFirstName(String firstName);
    
    enum Identifier implements ColumnIdentifier<AuthUser> {
        
        ID           ("id"),
        PASSWORD     ("password"),
        LAST_LOGIN   ("last_login"),
        IS_SUPERUSER ("is_superuser"),
        USERNAME     ("username"),
        LAST_NAME    ("last_name"),
        EMAIL        ("email"),
        IS_STAFF     ("is_staff"),
        IS_ACTIVE    ("is_active"),
        DATE_JOINED  ("date_joined"),
        FIRST_NAME   ("first_name");
        
        private final String columnId;
        private final TableIdentifier<AuthUser> tableIdentifier;
        
        Identifier(String columnId) {
            this.columnId        = columnId;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(), 
                getSchemaId(), 
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "innodb";
        }
        
        @Override
        public String getSchemaId() {
            return "innodb";
        }
        
        @Override
        public String getTableId() {
            return "auth_user";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<AuthUser> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}