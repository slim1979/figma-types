package io.quicktype;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

/**
 * A text box
 */
public class Text {
    private Effect[] effects;
    private String characters;
    private double opacity;
    private String name;
    private StrokeAlign strokeAlign;
    private double strokeWeight;
    private Paint[] fills;
    private Rectangle absoluteBoundingBox;
    private TypeStyle[] styleOverrideTable;
    private TypeStyle style;
    private String transitionNodeID;
    private boolean visible;
    private BlendMode blendMode;
    private LayoutConstraint constraints;
    private boolean isMask;
    private ExportSetting[] exportSettings;
    private NodeType type;
    private String id;
    private Paint[] strokes;
    private boolean preserveRatio;
    private double[] characterStyleOverrides;

    /**
     * An array of effects attached to this node
     * (see effects sectionfor more details)
     */
    @JsonProperty("effects")
    public Effect[] getEffects() { return effects; }
    @JsonProperty("effects")
    public void setEffects(Effect[] value) { this.effects = value; }

    /**
     * Text contained within text box
     */
    @JsonProperty("characters")
    public String getCharacters() { return characters; }
    @JsonProperty("characters")
    public void setCharacters(String value) { this.characters = value; }

    /**
     * Opacity of the node
     */
    @JsonProperty("opacity")
    public double getOpacity() { return opacity; }
    @JsonProperty("opacity")
    public void setOpacity(double value) { this.opacity = value; }

    /**
     * the name given to the node by the user in the tool.
     */
    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    /**
     * Where stroke is drawn relative to the vector outline as a string enum
     * "INSIDE": draw stroke inside the shape boundary
     * "OUTSIDE": draw stroke outside the shape boundary
     * "CENTER": draw stroke centered along the shape boundary
     */
    @JsonProperty("strokeAlign")
    public StrokeAlign getStrokeAlign() { return strokeAlign; }
    @JsonProperty("strokeAlign")
    public void setStrokeAlign(StrokeAlign value) { this.strokeAlign = value; }

    /**
     * The weight of strokes on the node
     */
    @JsonProperty("strokeWeight")
    public double getStrokeWeight() { return strokeWeight; }
    @JsonProperty("strokeWeight")
    public void setStrokeWeight(double value) { this.strokeWeight = value; }

    /**
     * An array of fill paints applied to the node
     */
    @JsonProperty("fills")
    public Paint[] getFills() { return fills; }
    @JsonProperty("fills")
    public void setFills(Paint[] value) { this.fills = value; }

    /**
     * Bounding box of the node in absolute space coordinates
     */
    @JsonProperty("absoluteBoundingBox")
    public Rectangle getAbsoluteBoundingBox() { return absoluteBoundingBox; }
    @JsonProperty("absoluteBoundingBox")
    public void setAbsoluteBoundingBox(Rectangle value) { this.absoluteBoundingBox = value; }

    /**
     * Map from ID to TypeStyle for looking up style overrides
     */
    @JsonProperty("styleOverrideTable")
    public TypeStyle[] getStyleOverrideTable() { return styleOverrideTable; }
    @JsonProperty("styleOverrideTable")
    public void setStyleOverrideTable(TypeStyle[] value) { this.styleOverrideTable = value; }

    /**
     * Style of text including font family and weight (see type style
     * section for more information)
     */
    @JsonProperty("style")
    public TypeStyle getStyle() { return style; }
    @JsonProperty("style")
    public void setStyle(TypeStyle value) { this.style = value; }

    /**
     * Node ID of node to transition to in prototyping
     */
    @JsonProperty("transitionNodeID")
    public String getTransitionNodeID() { return transitionNodeID; }
    @JsonProperty("transitionNodeID")
    public void setTransitionNodeID(String value) { this.transitionNodeID = value; }

    /**
     * whether or not the node is visible on the canvas
     */
    @JsonProperty("visible")
    public boolean getVisible() { return visible; }
    @JsonProperty("visible")
    public void setVisible(boolean value) { this.visible = value; }

    /**
     * How this node blends with nodes behind it in the scene
     * (see blend mode section for more details)
     */
    @JsonProperty("blendMode")
    public BlendMode getBlendMode() { return blendMode; }
    @JsonProperty("blendMode")
    public void setBlendMode(BlendMode value) { this.blendMode = value; }

    /**
     * Horizontal and vertical layout constraints for node
     */
    @JsonProperty("constraints")
    public LayoutConstraint getConstraints() { return constraints; }
    @JsonProperty("constraints")
    public void setConstraints(LayoutConstraint value) { this.constraints = value; }

    /**
     * Does this node mask sibling nodes in front of it?
     */
    @JsonProperty("isMask")
    public boolean getIsMask() { return isMask; }
    @JsonProperty("isMask")
    public void setIsMask(boolean value) { this.isMask = value; }

    /**
     * An array of export settings representing images to export from node
     */
    @JsonProperty("exportSettings")
    public ExportSetting[] getExportSettings() { return exportSettings; }
    @JsonProperty("exportSettings")
    public void setExportSettings(ExportSetting[] value) { this.exportSettings = value; }

    /**
     * the type of the node, refer to table below for details
     */
    @JsonProperty("type")
    public NodeType getType() { return type; }
    @JsonProperty("type")
    public void setType(NodeType value) { this.type = value; }

    /**
     * a string uniquely identifying this node within the document
     */
    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    /**
     * An array of stroke paints applied to the node
     */
    @JsonProperty("strokes")
    public Paint[] getStrokes() { return strokes; }
    @JsonProperty("strokes")
    public void setStrokes(Paint[] value) { this.strokes = value; }

    /**
     * Keep height and width constrained to same ratio
     */
    @JsonProperty("preserveRatio")
    public boolean getPreserveRatio() { return preserveRatio; }
    @JsonProperty("preserveRatio")
    public void setPreserveRatio(boolean value) { this.preserveRatio = value; }

    /**
     * Array with same number of elements as characeters in text box,
     * each element is a reference to the styleOverrideTable defined
     * below and maps to the corresponding character in the characters
     * field. Elements with value 0 have the default type style
     */
    @JsonProperty("characterStyleOverrides")
    public double[] getCharacterStyleOverrides() { return characterStyleOverrides; }
    @JsonProperty("characterStyleOverrides")
    public void setCharacterStyleOverrides(double[] value) { this.characterStyleOverrides = value; }
}
