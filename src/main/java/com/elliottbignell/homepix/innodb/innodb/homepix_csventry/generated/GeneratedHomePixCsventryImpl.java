package com.elliottbignell.homepix.innodb.innodb.homepix_csventry.generated;

import com.elliottbignell.homepix.innodb.innodb.homepix_csventry.HomePixCsventry;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.elliottbignell.homepix.innodb.innodb.homepix_csventry.HomePixCsventry}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedHomePixCsventryImpl implements HomePixCsventry {
    
    private Integer id;
    private String filename;
    private String imageRef;
    private String caption;
    private String tags;
    private String licenseType;
    private String userName;
    private String superTags;
    private String location;
    private Byte numberOfPeople;
    private String modelRelease;
    private String isThereProperty;
    private String propertyRelease;
    private String primaryCategory;
    private String secondaryCategory;
    private String imageType;
    private String exclusiveToAlamy;
    private String additionalInfo;
    private String status;
    private String dateTaken;
    
    protected GeneratedHomePixCsventryImpl() {}
    
    @Override
    public OptionalInt getId() {
        return OptionalUtil.ofNullable(id);
    }
    
    @Override
    public Optional<String> getFilename() {
        return Optional.ofNullable(filename);
    }
    
    @Override
    public Optional<String> getImageRef() {
        return Optional.ofNullable(imageRef);
    }
    
    @Override
    public Optional<String> getCaption() {
        return Optional.ofNullable(caption);
    }
    
    @Override
    public Optional<String> getTags() {
        return Optional.ofNullable(tags);
    }
    
    @Override
    public Optional<String> getLicenseType() {
        return Optional.ofNullable(licenseType);
    }
    
    @Override
    public Optional<String> getUserName() {
        return Optional.ofNullable(userName);
    }
    
    @Override
    public Optional<String> getSuperTags() {
        return Optional.ofNullable(superTags);
    }
    
    @Override
    public Optional<String> getLocation() {
        return Optional.ofNullable(location);
    }
    
    @Override
    public Optional<Byte> getNumberOfPeople() {
        return Optional.ofNullable(numberOfPeople);
    }
    
    @Override
    public Optional<String> getModelRelease() {
        return Optional.ofNullable(modelRelease);
    }
    
    @Override
    public Optional<String> getIsThereProperty() {
        return Optional.ofNullable(isThereProperty);
    }
    
    @Override
    public Optional<String> getPropertyRelease() {
        return Optional.ofNullable(propertyRelease);
    }
    
    @Override
    public Optional<String> getPrimaryCategory() {
        return Optional.ofNullable(primaryCategory);
    }
    
    @Override
    public Optional<String> getSecondaryCategory() {
        return Optional.ofNullable(secondaryCategory);
    }
    
    @Override
    public Optional<String> getImageType() {
        return Optional.ofNullable(imageType);
    }
    
    @Override
    public Optional<String> getExclusiveToAlamy() {
        return Optional.ofNullable(exclusiveToAlamy);
    }
    
    @Override
    public Optional<String> getAdditionalInfo() {
        return Optional.ofNullable(additionalInfo);
    }
    
    @Override
    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }
    
    @Override
    public Optional<String> getDateTaken() {
        return Optional.ofNullable(dateTaken);
    }
    
    @Override
    public HomePixCsventry setId(Integer id) {
        this.id = id;
        return this;
    }
    
    @Override
    public HomePixCsventry setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    
    @Override
    public HomePixCsventry setImageRef(String imageRef) {
        this.imageRef = imageRef;
        return this;
    }
    
    @Override
    public HomePixCsventry setCaption(String caption) {
        this.caption = caption;
        return this;
    }
    
    @Override
    public HomePixCsventry setTags(String tags) {
        this.tags = tags;
        return this;
    }
    
    @Override
    public HomePixCsventry setLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }
    
    @Override
    public HomePixCsventry setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    
    @Override
    public HomePixCsventry setSuperTags(String superTags) {
        this.superTags = superTags;
        return this;
    }
    
    @Override
    public HomePixCsventry setLocation(String location) {
        this.location = location;
        return this;
    }
    
    @Override
    public HomePixCsventry setNumberOfPeople(Byte numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
        return this;
    }
    
    @Override
    public HomePixCsventry setModelRelease(String modelRelease) {
        this.modelRelease = modelRelease;
        return this;
    }
    
    @Override
    public HomePixCsventry setIsThereProperty(String isThereProperty) {
        this.isThereProperty = isThereProperty;
        return this;
    }
    
    @Override
    public HomePixCsventry setPropertyRelease(String propertyRelease) {
        this.propertyRelease = propertyRelease;
        return this;
    }
    
    @Override
    public HomePixCsventry setPrimaryCategory(String primaryCategory) {
        this.primaryCategory = primaryCategory;
        return this;
    }
    
    @Override
    public HomePixCsventry setSecondaryCategory(String secondaryCategory) {
        this.secondaryCategory = secondaryCategory;
        return this;
    }
    
    @Override
    public HomePixCsventry setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    
    @Override
    public HomePixCsventry setExclusiveToAlamy(String exclusiveToAlamy) {
        this.exclusiveToAlamy = exclusiveToAlamy;
        return this;
    }
    
    @Override
    public HomePixCsventry setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }
    
    @Override
    public HomePixCsventry setStatus(String status) {
        this.status = status;
        return this;
    }
    
    @Override
    public HomePixCsventry setDateTaken(String dateTaken) {
        this.dateTaken = dateTaken;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "                + Objects.toString(OptionalUtil.unwrap(getId())));
        sj.add("filename = "          + Objects.toString(OptionalUtil.unwrap(getFilename())));
        sj.add("imageRef = "          + Objects.toString(OptionalUtil.unwrap(getImageRef())));
        sj.add("caption = "           + Objects.toString(OptionalUtil.unwrap(getCaption())));
        sj.add("tags = "              + Objects.toString(OptionalUtil.unwrap(getTags())));
        sj.add("licenseType = "       + Objects.toString(OptionalUtil.unwrap(getLicenseType())));
        sj.add("userName = "          + Objects.toString(OptionalUtil.unwrap(getUserName())));
        sj.add("superTags = "         + Objects.toString(OptionalUtil.unwrap(getSuperTags())));
        sj.add("location = "          + Objects.toString(OptionalUtil.unwrap(getLocation())));
        sj.add("numberOfPeople = "    + Objects.toString(OptionalUtil.unwrap(getNumberOfPeople())));
        sj.add("modelRelease = "      + Objects.toString(OptionalUtil.unwrap(getModelRelease())));
        sj.add("isThereProperty = "   + Objects.toString(OptionalUtil.unwrap(getIsThereProperty())));
        sj.add("propertyRelease = "   + Objects.toString(OptionalUtil.unwrap(getPropertyRelease())));
        sj.add("primaryCategory = "   + Objects.toString(OptionalUtil.unwrap(getPrimaryCategory())));
        sj.add("secondaryCategory = " + Objects.toString(OptionalUtil.unwrap(getSecondaryCategory())));
        sj.add("imageType = "         + Objects.toString(OptionalUtil.unwrap(getImageType())));
        sj.add("exclusiveToAlamy = "  + Objects.toString(OptionalUtil.unwrap(getExclusiveToAlamy())));
        sj.add("additionalInfo = "    + Objects.toString(OptionalUtil.unwrap(getAdditionalInfo())));
        sj.add("status = "            + Objects.toString(OptionalUtil.unwrap(getStatus())));
        sj.add("dateTaken = "         + Objects.toString(OptionalUtil.unwrap(getDateTaken())));
        return "HomePixCsventryImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof HomePixCsventry)) { return false; }
        final HomePixCsventry thatHomePixCsventry = (HomePixCsventry)that;
        if (!Objects.equals(this.getId(), thatHomePixCsventry.getId())) { return false; }
        if (!Objects.equals(this.getFilename(), thatHomePixCsventry.getFilename())) { return false; }
        if (!Objects.equals(this.getImageRef(), thatHomePixCsventry.getImageRef())) { return false; }
        if (!Objects.equals(this.getCaption(), thatHomePixCsventry.getCaption())) { return false; }
        if (!Objects.equals(this.getTags(), thatHomePixCsventry.getTags())) { return false; }
        if (!Objects.equals(this.getLicenseType(), thatHomePixCsventry.getLicenseType())) { return false; }
        if (!Objects.equals(this.getUserName(), thatHomePixCsventry.getUserName())) { return false; }
        if (!Objects.equals(this.getSuperTags(), thatHomePixCsventry.getSuperTags())) { return false; }
        if (!Objects.equals(this.getLocation(), thatHomePixCsventry.getLocation())) { return false; }
        if (!Objects.equals(this.getNumberOfPeople(), thatHomePixCsventry.getNumberOfPeople())) { return false; }
        if (!Objects.equals(this.getModelRelease(), thatHomePixCsventry.getModelRelease())) { return false; }
        if (!Objects.equals(this.getIsThereProperty(), thatHomePixCsventry.getIsThereProperty())) { return false; }
        if (!Objects.equals(this.getPropertyRelease(), thatHomePixCsventry.getPropertyRelease())) { return false; }
        if (!Objects.equals(this.getPrimaryCategory(), thatHomePixCsventry.getPrimaryCategory())) { return false; }
        if (!Objects.equals(this.getSecondaryCategory(), thatHomePixCsventry.getSecondaryCategory())) { return false; }
        if (!Objects.equals(this.getImageType(), thatHomePixCsventry.getImageType())) { return false; }
        if (!Objects.equals(this.getExclusiveToAlamy(), thatHomePixCsventry.getExclusiveToAlamy())) { return false; }
        if (!Objects.equals(this.getAdditionalInfo(), thatHomePixCsventry.getAdditionalInfo())) { return false; }
        if (!Objects.equals(this.getStatus(), thatHomePixCsventry.getStatus())) { return false; }
        if (!Objects.equals(this.getDateTaken(), thatHomePixCsventry.getDateTaken())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getId()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getFilename()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getImageRef()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getCaption()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getTags()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getLicenseType()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getUserName()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getSuperTags()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getLocation()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getNumberOfPeople()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getModelRelease()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getIsThereProperty()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getPropertyRelease()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getPrimaryCategory()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getSecondaryCategory()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getImageType()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getExclusiveToAlamy()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getAdditionalInfo()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getStatus()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getDateTaken()));
        return hash;
    }
}