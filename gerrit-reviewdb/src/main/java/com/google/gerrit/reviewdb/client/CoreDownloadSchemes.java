// Copyright (C) 2015 The Android Open Source Project
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.gerrit.reviewdb.client;

/**
 * Download scheme string constants supported by the download-commands core
 * plugin.
 */
public class CoreDownloadSchemes {
  public static final String ANON_GIT = "git";
  public static final String ANON_HTTP = "anonymous http";
  public static final String HTTP = "http";
  public static final String SSH = "ssh";
  public static final String REPO_DOWNLOAD = "repo";

  private CoreDownloadSchemes() {
  }
}
