package com.elliottbignell.homepix.innodb.innodb.homepix_comment.generated;

import com.elliottbignell.homepix.innodb.innodb.homepix_comment.HomePixComment;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.enterprise.datastore.runtime.field.DatastoreFields;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;
import java.util.Optional;

/**
 * The generated base for the {@link
 * com.elliottbignell.homepix.innodb.innodb.homepix_comment.HomePixComment}-interface
 * representing entities of the {@code homePIX_comment}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedHomePixComment {
    
    /**
     * This Field corresponds to the {@link HomePixComment} field that can be
     * obtained using the {@link HomePixComment#getId()} method.
     */
    ComparableField<HomePixComment, Byte, Byte> ID = DatastoreFields.createComparableField(
        Identifier.ID,
        o -> OptionalUtil.unwrap(o.getId()),
        HomePixComment::setId,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixComment} field that can be
     * obtained using the {@link HomePixComment#getAuthor()} method.
     */
    StringField<HomePixComment, String> AUTHOR = DatastoreFields.createStringField(
        Identifier.AUTHOR,
        o -> OptionalUtil.unwrap(o.getAuthor()),
        HomePixComment::setAuthor,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixComment} field that can be
     * obtained using the {@link HomePixComment#getText()} method.
     */
    StringField<HomePixComment, String> TEXT = DatastoreFields.createStringField(
        Identifier.TEXT,
        o -> OptionalUtil.unwrap(o.getText()),
        HomePixComment::setText,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixComment} field that can be
     * obtained using the {@link HomePixComment#getCreateDate()} method.
     */
    ComparableField<HomePixComment, Timestamp, Timestamp> CREATE_DATE = DatastoreFields.createComparableField(
        Identifier.CREATE_DATE,
        o -> OptionalUtil.unwrap(o.getCreateDate()),
        HomePixComment::setCreateDate,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixComment} field that can be
     * obtained using the {@link HomePixComment#getApprovedComment()} method.
     */
    ComparableField<HomePixComment, Byte, Byte> APPROVED_COMMENT = DatastoreFields.createComparableField(
        Identifier.APPROVED_COMMENT,
        o -> OptionalUtil.unwrap(o.getApprovedComment()),
        HomePixComment::setApprovedComment,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixComment} field that can be
     * obtained using the {@link HomePixComment#getPostId()} method.
     */
    ComparableField<HomePixComment, Short, Short> POST_ID = DatastoreFields.createComparableField(
        Identifier.POST_ID,
        o -> OptionalUtil.unwrap(o.getPostId()),
        HomePixComment::setPostId,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the id of this HomePixComment. The id field corresponds to the
     * database column innodb.innodb.homePIX_comment.id.
     * 
     * @return the id of this HomePixComment
     */
    Optional<Byte> getId();
    
    /**
     * Returns the author of this HomePixComment. The author field corresponds
     * to the database column innodb.innodb.homePIX_comment.author.
     * 
     * @return the author of this HomePixComment
     */
    Optional<String> getAuthor();
    
    /**
     * Returns the text of this HomePixComment. The text field corresponds to
     * the database column innodb.innodb.homePIX_comment.text.
     * 
     * @return the text of this HomePixComment
     */
    Optional<String> getText();
    
    /**
     * Returns the createDate of this HomePixComment. The createDate field
     * corresponds to the database column
     * innodb.innodb.homePIX_comment.create_date.
     * 
     * @return the createDate of this HomePixComment
     */
    Optional<Timestamp> getCreateDate();
    
    /**
     * Returns the approvedComment of this HomePixComment. The approvedComment
     * field corresponds to the database column
     * innodb.innodb.homePIX_comment.approved_comment.
     * 
     * @return the approvedComment of this HomePixComment
     */
    Optional<Byte> getApprovedComment();
    
    /**
     * Returns the postId of this HomePixComment. The postId field corresponds
     * to the database column innodb.innodb.homePIX_comment.post_id.
     * 
     * @return the postId of this HomePixComment
     */
    Optional<Short> getPostId();
    
    /**
     * Sets the id of this HomePixComment. The id field corresponds to the
     * database column innodb.innodb.homePIX_comment.id.
     * 
     * @param id to set of this HomePixComment
     * @return   this HomePixComment instance
     */
    HomePixComment setId(Byte id);
    
    /**
     * Sets the author of this HomePixComment. The author field corresponds to
     * the database column innodb.innodb.homePIX_comment.author.
     * 
     * @param author to set of this HomePixComment
     * @return       this HomePixComment instance
     */
    HomePixComment setAuthor(String author);
    
    /**
     * Sets the text of this HomePixComment. The text field corresponds to the
     * database column innodb.innodb.homePIX_comment.text.
     * 
     * @param text to set of this HomePixComment
     * @return     this HomePixComment instance
     */
    HomePixComment setText(String text);
    
    /**
     * Sets the createDate of this HomePixComment. The createDate field
     * corresponds to the database column
     * innodb.innodb.homePIX_comment.create_date.
     * 
     * @param createDate to set of this HomePixComment
     * @return           this HomePixComment instance
     */
    HomePixComment setCreateDate(Timestamp createDate);
    
    /**
     * Sets the approvedComment of this HomePixComment. The approvedComment
     * field corresponds to the database column
     * innodb.innodb.homePIX_comment.approved_comment.
     * 
     * @param approvedComment to set of this HomePixComment
     * @return                this HomePixComment instance
     */
    HomePixComment setApprovedComment(Byte approvedComment);
    
    /**
     * Sets the postId of this HomePixComment. The postId field corresponds to
     * the database column innodb.innodb.homePIX_comment.post_id.
     * 
     * @param postId to set of this HomePixComment
     * @return       this HomePixComment instance
     */
    HomePixComment setPostId(Short postId);
    
    enum Identifier implements ColumnIdentifier<HomePixComment> {
        
        ID               ("id"),
        AUTHOR           ("author"),
        TEXT             ("text"),
        CREATE_DATE      ("create_date"),
        APPROVED_COMMENT ("approved_comment"),
        POST_ID          ("post_id");
        
        private final String columnId;
        private final TableIdentifier<HomePixComment> tableIdentifier;
        
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
            return "homePIX_comment";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<HomePixComment> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}