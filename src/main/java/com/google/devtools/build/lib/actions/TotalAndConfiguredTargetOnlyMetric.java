// Copyright 2021 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.devtools.build.lib.actions;

import com.google.auto.value.AutoValue;

/**
 * Class representing a metric for which we have both an overall number (including aspects) and
 * specific-to-configured-target number. Usually aspects and configured targets should be considered
 * together, but some historical metrics only counted configured targets, so we provide this
 * granularity for consumers who care.
 */
@AutoValue
public abstract class TotalAndConfiguredTargetOnlyMetric {
  public abstract int total();

  public abstract int configuredTargetsOnly();

  public static TotalAndConfiguredTargetOnlyMetric create(int total, int configuredTargetsOnly) {
    return new AutoValue_TotalAndConfiguredTargetOnlyMetric(total, configuredTargetsOnly);
  }
}
