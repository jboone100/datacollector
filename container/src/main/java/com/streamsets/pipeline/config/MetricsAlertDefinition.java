/**
 * (c) 2014 StreamSets, Inc. All rights reserved. May not
 * be copied, modified, or distributed in whole or part without
 * written consent of StreamSets, Inc.
 */
package com.streamsets.pipeline.config;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.streamsets.pipeline.api.impl.Utils;

public class MetricsAlertDefinition {

  private final String name;
  private final String label;
  private final String metricId;
  private final MetricType metricType;
  private final MetricElement metricElement;
  private final String predicate;
  private final boolean enabled;

  @JsonCreator
  public MetricsAlertDefinition(@JsonProperty("name") String name,
                                @JsonProperty("label") String label,
                                @JsonProperty("metricId") String metricId,
                                @JsonProperty("metricType") MetricType metricType,
                                @JsonProperty("metricElement") MetricElement metricElement,
                                @JsonProperty("predicate") String predicate,
                                @JsonProperty("enabled") boolean enabled) {
    this.name = name;
    this.label = label;
    this.metricId = metricId;
    this.metricType = metricType;
    this.metricElement = metricElement;
    this.predicate = predicate;
    this.enabled = enabled;
  }

  public String getName() {
    return name;
  }

  public String getLabel() {
    return label;
  }

  public String getMetricId() {
    return metricId;
  }

  public MetricElement getMetricElement() {
    return metricElement;
  }

  public String getPredicate() {
    return predicate;
  }

  public boolean isEnabled() {
    return enabled;
  }

  public MetricType getMetricType() {
    return metricType;
  }

  @Override
  public String toString() {
    return Utils.format(
      "MetricsAlertDefinition[name='{}' label='{}' predicate='{}' enabled='{}', metricType='{}', metricElement='{}']",
      getName(), getLabel(), getPredicate(), isEnabled(), getMetricType().name(), getMetricElement().name());
  }
}
