package com.example.androidimpltemplate.example;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import kotlin.jvm.internal.Intrinsics;

public final class UserJava {
  @NotNull
  private final String name;
  @Nullable
  private final String designation;

  @NotNull
  public final String getName() {
    return this.name;
  }

  @Nullable
  public final String getDesignation() {
    return this.designation;
  }

  public UserJava(@NotNull String name, @Nullable String designation) {
      this.name = name;
      this.designation = designation;
   }

  @NotNull
  public final String component1() {
    return this.name;
  }

  @Nullable
  public final String component2() {
    return this.designation;
  }

  @NotNull
  public final UserJava copy(@NotNull String name, @Nullable String designation) {
    return new UserJava(name, designation);
  }

  @NotNull
  public String toString() {
    return "User(name=" + this.name + ", designation=" + this.designation + ")";
  }

  public int hashCode() {
    int var1 = this.name.hashCode() * 31;
    String var10001 = this.designation;
    return var1 + (var10001 != null ? var10001.hashCode() : 0);
  }

   public boolean equals(@Nullable Object var1) {
    if (this != var1) {
      if (var1 instanceof UserJava) {
        UserJava var2 = (UserJava)var1;
        if (Intrinsics.areEqual(this.name, var2.name) && Intrinsics.areEqual(this.designation, var2.designation)) {
          return true;
        }
      }
      return false;
    } else {
      return true;
    }
  }
}
