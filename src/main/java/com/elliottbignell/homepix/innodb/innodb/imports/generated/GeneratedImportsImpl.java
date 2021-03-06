package com.elliottbignell.homepix.innodb.innodb.imports.generated;

import com.elliottbignell.homepix.innodb.innodb.imports.Imports;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.elliottbignell.homepix.innodb.innodb.imports.Imports}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedImportsImpl implements Imports {
    
    private Integer id;
    private String file;
    private String title;
    private String sortkey;
    private String addedOn;
    private String lastModified;
    private Short keywordsId;
    private Short pathId;
    private String location;
    private String primaryCategory;
    private String secondaryCategory;
    private String takenOn;
    private Integer id1;
    private String filename;
    private String imageRef;
    private String caption;
    private String tags;
    private String licenseType;
    private String userName;
    private String superTags;
    private String location1;
    private Byte numberOfPeople;
    private String modelRelease;
    private String isThereProperty;
    private String propertyRelease;
    private String primaryCategory1;
    private String secondaryCategory1;
    private String imageType;
    private String exclusiveToAlamy;
    private String additionalInfo;
    private String status;
    private String dateTaken;
    private String taken;
    private String shot;
    
    protected GeneratedImportsImpl() {}
    
    @Override
    public OptionalInt getId() {
        return OptionalUtil.ofNullable(id);
    }
    
    @Override
    public Optional<String> getFile() {
        return Optional.ofNullable(file);
    }
    
    @Override
    public Optional<String> getTitle() {
        return Optional.ofNullable(title);
    }
    
    @Override
    public Optional<String> getSortkey() {
        return Optional.ofNullable(sortkey);
    }
    
    @Override
    public Optional<String> getAddedOn() {
        return Optional.ofNullable(addedOn);
    }
    
    @Override
    public Optional<String> getLastModified() {
        return Optional.ofNullable(lastModified);
    }
    
    @Override
    public Optional<Short> getKeywordsId() {
        return Optional.ofNullable(keywordsId);
    }
    
    @Override
    public Optional<Short> getPathId() {
        return Optional.ofNullable(pathId);
    }
    
    @Override
    public Optional<String> getLocation() {
        return Optional.ofNullable(location);
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
    public Optional<String> getTakenOn() {
        return Optional.ofNullable(takenOn);
    }
    
    @Override
    public OptionalInt getId1() {
        return OptionalUtil.ofNullable(id1);
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
    public Optional<String> getLocation1() {
        return Optional.ofNullable(location1);
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
    public Optional<String> getPrimaryCategory1() {
        return Optional.ofNullable(primaryCategory1);
    }
    
    @Override
    public Optional<String> getSecondaryCategory1() {
        return Optional.ofNullable(secondaryCategory1);
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
    public Optional<String> getTaken() {
        return Optional.ofNullable(taken);
    }
    
    @Override
    public Optional<String> getShot() {
        return Optional.ofNullable(shot);
    }
    
    @Override
    public Imports setId(Integer id) {
        this.id = id;
        return this;
    }
    
    @Override
    public Imports setFile(String file) {
        this.file = file;
        return this;
    }
    
    @Override
    public Imports setTitle(String title) {
        this.title = title;
        return this;
    }
    
    @Override
    public Imports setSortkey(String sortkey) {
        this.sortkey = sortkey;
        return this;
    }
    
    @Override
    public Imports setAddedOn(String addedOn) {
        this.addedOn = addedOn;
        return this;
    }
    
    @Override
    public Imports setLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    
    @Override
    public Imports setKeywordsId(Short keywordsId) {
        this.keywordsId = keywordsId;
        return this;
    }
    
    @Override
    public Imports setPathId(Short pathId) {
        this.pathId = pathId;
        return this;
    }
    
    @Override
    public Imports setLocation(String location) {
        this.location = location;
        return this;
    }
    
    @Override
    public Imports setPrimaryCategory(String primaryCategory) {
        this.primaryCategory = primaryCategory;
        return this;
    }
    
    @Override
    public Imports setSecondaryCategory(String secondaryCategory) {
        this.secondaryCategory = secondaryCategory;
        return this;
    }
    
    @Override
    public Imports setTakenOn(String takenOn) {
        this.takenOn = takenOn;
        return this;
    }
    
    @Override
    public Imports setId1(Integer id1) {
        this.id1 = id1;
        return this;
    }
    
    @Override
    public Imports setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    
    @Override
    public Imports setImageRef(String imageRef) {
        this.imageRef = imageRef;
        return this;
    }
    
    @Override
    public Imports setCaption(String caption) {
        this.caption = caption;
        return this;
    }
    
    @Override
    public Imports setTags(String tags) {
        this.tags = tags;
        return this;
    }
    
    @Override
    public Imports setLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }
    
    @Override
    public Imports setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    
    @Override
    public Imports setSuperTags(String superTags) {
        this.superTags = superTags;
        return this;
    }
    
    @Override
    public Imports setLocation1(String location1) {
        this.location1 = location1;
        return this;
    }
    
    @Override
    public Imports setNumberOfPeople(Byte numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
        return this;
    }
    
    @Override
    public Imports setModelRelease(String modelRelease) {
        this.modelRelease = modelRelease;
        return this;
    }
    
    @Override
    public Imports setIsThereProperty(String isThereProperty) {
        this.isThereProperty = isThereProperty;
        return this;
    }
    
    @Override
    public Imports setPropertyRelease(String propertyRelease) {
        this.propertyRelease = propertyRelease;
        return this;
    }
    
    @Override
    public Imports setPrimaryCategory1(String primaryCategory1) {
        this.primaryCategory1 = primaryCategory1;
        return this;
    }
    
    @Override
    public Imports setSecondaryCategory1(String secondaryCategory1) {
        this.secondaryCategory1 = secondaryCategory1;
        return this;
    }
    
    @Override
    public Imports setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    
    @Override
    public Imports setExclusiveToAlamy(String exclusiveToAlamy) {
        this.exclusiveToAlamy = exclusiveToAlamy;
        return this;
    }
    
    @Override
    public Imports setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }
    
    @Override
    public Imports setStatus(String status) {
        this.status = status;
        return this;
    }
    
    @Override
    public Imports setDateTaken(String dateTaken) {
        this.dateTaken = dateTaken;
        return this;
    }
    
    @Override
    public Imports setTaken(String taken) {
        this.taken = taken;
        return this;
    }
    
    @Override
    public Imports setShot(String shot) {
        this.shot = shot;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "                 + Objects.toString(OptionalUtil.unwrap(getId())));
        sj.add("file = "               + Objects.toString(OptionalUtil.unwrap(getFile())));
        sj.add("title = "              + Objects.toString(OptionalUtil.unwrap(getTitle())));
        sj.add("sortkey = "            + Objects.toString(OptionalUtil.unwrap(getSortkey())));
        sj.add("addedOn = "            + Objects.toString(OptionalUtil.unwrap(getAddedOn())));
        sj.add("lastModified = "       + Objects.toString(OptionalUtil.unwrap(getLastModified())));
        sj.add("keywordsId = "         + Objects.toString(OptionalUtil.unwrap(getKeywordsId())));
        sj.add("pathId = "             + Objects.toString(OptionalUtil.unwrap(getPathId())));
        sj.add("location = "           + Objects.toString(OptionalUtil.unwrap(getLocation())));
        sj.add("primaryCategory = "    + Objects.toString(OptionalUtil.unwrap(getPrimaryCategory())));
        sj.add("secondaryCategory = "  + Objects.toString(OptionalUtil.unwrap(getSecondaryCategory())));
        sj.add("takenOn = "            + Objects.toString(OptionalUtil.unwrap(getTakenOn())));
        sj.add("id1 = "                + Objects.toString(OptionalUtil.unwrap(getId1())));
        sj.add("filename = "           + Objects.toString(OptionalUtil.unwrap(getFilename())));
        sj.add("imageRef = "           + Objects.toString(OptionalUtil.unwrap(getImageRef())));
        sj.add("caption = "            + Objects.toString(OptionalUtil.unwrap(getCaption())));
        sj.add("tags = "               + Objects.toString(OptionalUtil.unwrap(getTags())));
        sj.add("licenseType = "        + Objects.toString(OptionalUtil.unwrap(getLicenseType())));
        sj.add("userName = "           + Objects.toString(OptionalUtil.unwrap(getUserName())));
        sj.add("superTags = "          + Objects.toString(OptionalUtil.unwrap(getSuperTags())));
        sj.add("location1 = "          + Objects.toString(OptionalUtil.unwrap(getLocation1())));
        sj.add("numberOfPeople = "     + Objects.toString(OptionalUtil.unwrap(getNumberOfPeople())));
        sj.add("modelRelease = "       + Objects.toString(OptionalUtil.unwrap(getModelRelease())));
        sj.add("isThereProperty = "    + Objects.toString(OptionalUtil.unwrap(getIsThereProperty())));
        sj.add("propertyRelease = "    + Objects.toString(OptionalUtil.unwrap(getPropertyRelease())));
        sj.add("primaryCategory1 = "   + Objects.toString(OptionalUtil.unwrap(getPrimaryCategory1())));
        sj.add("secondaryCategory1 = " + Objects.toString(OptionalUtil.unwrap(getSecondaryCategory1())));
        sj.add("imageType = "          + Objects.toString(OptionalUtil.unwrap(getImageType())));
        sj.add("exclusiveToAlamy = "   + Objects.toString(OptionalUtil.unwrap(getExclusiveToAlamy())));
        sj.add("additionalInfo = "     + Objects.toString(OptionalUtil.unwrap(getAdditionalInfo())));
        sj.add("status = "             + Objects.toString(OptionalUtil.unwrap(getStatus())));
        sj.add("dateTaken = "          + Objects.toString(OptionalUtil.unwrap(getDateTaken())));
        sj.add("taken = "              + Objects.toString(OptionalUtil.unwrap(getTaken())));
        sj.add("shot = "               + Objects.toString(OptionalUtil.unwrap(getShot())));
        return "ImportsImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Imports)) { return false; }
        final Imports thatImports = (Imports)that;
        if (!Objects.equals(this.getId(), thatImports.getId())) { return false; }
        if (!Objects.equals(this.getFile(), thatImports.getFile())) { return false; }
        if (!Objects.equals(this.getTitle(), thatImports.getTitle())) { return false; }
        if (!Objects.equals(this.getSortkey(), thatImports.getSortkey())) { return false; }
        if (!Objects.equals(this.getAddedOn(), thatImports.getAddedOn())) { return false; }
        if (!Objects.equals(this.getLastModified(), thatImports.getLastModified())) { return false; }
        if (!Objects.equals(this.getKeywordsId(), thatImports.getKeywordsId())) { return false; }
        if (!Objects.equals(this.getPathId(), thatImports.getPathId())) { return false; }
        if (!Objects.equals(this.getLocation(), thatImports.getLocation())) { return false; }
        if (!Objects.equals(this.getPrimaryCategory(), thatImports.getPrimaryCategory())) { return false; }
        if (!Objects.equals(this.getSecondaryCategory(), thatImports.getSecondaryCategory())) { return false; }
        if (!Objects.equals(this.getTakenOn(), thatImports.getTakenOn())) { return false; }
        if (!Objects.equals(this.getId1(), thatImports.getId1())) { return false; }
        if (!Objects.equals(this.getFilename(), thatImports.getFilename())) { return false; }
        if (!Objects.equals(this.getImageRef(), thatImports.getImageRef())) { return false; }
        if (!Objects.equals(this.getCaption(), thatImports.getCaption())) { return false; }
        if (!Objects.equals(this.getTags(), thatImports.getTags())) { return false; }
        if (!Objects.equals(this.getLicenseType(), thatImports.getLicenseType())) { return false; }
        if (!Objects.equals(this.getUserName(), thatImports.getUserName())) { return false; }
        if (!Objects.equals(this.getSuperTags(), thatImports.getSuperTags())) { return false; }
        if (!Objects.equals(this.getLocation1(), thatImports.getLocation1())) { return false; }
        if (!Objects.equals(this.getNumberOfPeople(), thatImports.getNumberOfPeople())) { return false; }
        if (!Objects.equals(this.getModelRelease(), thatImports.getModelRelease())) { return false; }
        if (!Objects.equals(this.getIsThereProperty(), thatImports.getIsThereProperty())) { return false; }
        if (!Objects.equals(this.getPropertyRelease(), thatImports.getPropertyRelease())) { return false; }
        if (!Objects.equals(this.getPrimaryCategory1(), thatImports.getPrimaryCategory1())) { return false; }
        if (!Objects.equals(this.getSecondaryCategory1(), thatImports.getSecondaryCategory1())) { return false; }
        if (!Objects.equals(this.getImageType(), thatImports.getImageType())) { return false; }
        if (!Objects.equals(this.getExclusiveToAlamy(), thatImports.getExclusiveToAlamy())) { return false; }
        if (!Objects.equals(this.getAdditionalInfo(), thatImports.getAdditionalInfo())) { return false; }
        if (!Objects.equals(this.getStatus(), thatImports.getStatus())) { return false; }
        if (!Objects.equals(this.getDateTaken(), thatImports.getDateTaken())) { return false; }
        if (!Objects.equals(this.getTaken(), thatImports.getTaken())) { return false; }
        if (!Objects.equals(this.getShot(), thatImports.getShot())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getId()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getFile()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getTitle()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getSortkey()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getAddedOn()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getLastModified()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getKeywordsId()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getPathId()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getLocation()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getPrimaryCategory()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getSecondaryCategory()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getTakenOn()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getId1()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getFilename()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getImageRef()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getCaption()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getTags()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getLicenseType()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getUserName()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getSuperTags()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getLocation1()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getNumberOfPeople()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getModelRelease()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getIsThereProperty()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getPropertyRelease()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getPrimaryCategory1()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getSecondaryCategory1()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getImageType()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getExclusiveToAlamy()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getAdditionalInfo()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getStatus()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getDateTaken()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getTaken()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getShot()));
        return hash;
    }
}